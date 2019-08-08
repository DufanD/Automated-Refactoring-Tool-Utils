package com.finalproject.automated.refactoring.tool.utils.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

public interface MethodModelHelper {

    String createMethod(@NonNull MethodModel methodModel);

    String createMethodRegex(@NonNull MethodModel methodModel);
}
