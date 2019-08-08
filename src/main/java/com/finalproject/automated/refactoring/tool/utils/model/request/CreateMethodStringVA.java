package com.finalproject.automated.refactoring.tool.utils.model.request;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Getter
@Builder
public class CreateMethodStringVA<T> {

    private T property;

    private Integer index;

    private Integer maxSize;

    private Boolean isRegex;
}
