package com.finalproject.automated.refactoring.tool.utils.service;

import lombok.NonNull;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

public interface ThreadsWatcher {

    void waitAllThreadsDone(@NonNull List<Future> threads, @NonNull Integer waitingTime);
}
