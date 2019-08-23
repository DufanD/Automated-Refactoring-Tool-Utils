package com.finalproject.automated.refactoring.tool.utils.service.implementation;

import com.finalproject.automated.refactoring.tool.utils.service.ThreadsWatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Service
public class ThreadsWatcherImpl implements ThreadsWatcher {

    @Override
    public void waitAllThreadsDone(List<Future> threads, Integer waitingTime) {
        while (true) {
            Long finishedThreads = countFinishedThreads(threads);

            if (isAllFinished(finishedThreads, threads.size())) {
                break;
            }

            waitForThreads(waitingTime);
        }
    }

    private Long countFinishedThreads(List<Future> futures) {
        return futures.stream()
                .filter(this::isFinished)
                .count();
    }

    private Boolean isFinished(Future thread) {
        return thread == null || thread.isDone();
    }

    private Boolean isAllFinished(Long finishedThreads, Integer numberOfThreads) {
        return finishedThreads.equals(numberOfThreads.longValue());
    }

    private void waitForThreads(Integer waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            // Do nothing
            // Mark of interrupted threads
        }
    }
}
