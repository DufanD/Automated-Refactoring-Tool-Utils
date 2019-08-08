package com.finalproject.automated.refactoring.tool.utils.model.request;

import lombok.Data;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Data
public class IsStatementVA {

    private Stack<Character> stack = new Stack<>();

    private AtomicBoolean escape = new AtomicBoolean();
}
