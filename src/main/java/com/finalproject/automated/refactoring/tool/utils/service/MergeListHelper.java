package com.finalproject.automated.refactoring.tool.utils.service;

import lombok.NonNull;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

public interface MergeListHelper {

    void mergeListOfString(@NonNull List<String> listToMerge, @NonNull List<Integer> mergeIndex,
                           @NonNull String delimiter);
}
