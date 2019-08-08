package com.finalproject.automated.refactoring.tool.utils.service;

import com.finalproject.automated.refactoring.tool.utils.model.request.ReplaceFileVA;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

public interface ReplaceFileHelper {

    Boolean replaceFile(@NonNull ReplaceFileVA replaceFileVA);
}
