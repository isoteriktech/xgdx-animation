package io.github.isoteriktech.xgdx.animation.conditions;

import io.github.isoteriktech.xgdx.animation.ICondition;

/**
 * A condition that inverts the evaluated value of another condition.
 *
 * @author isoteriksoftware
 */
public class NotCondition implements ICondition {
    protected ICondition condition;

    /**
     * Creates a new instance given the condition to invert.
     * @param condition the condition to invert
     */
    public NotCondition(ICondition condition) {
        this.condition = condition;
    }

    /**
     *
     * @return an inverted value of the sub-condition
     */
    @Override
    public boolean test() {
        return !condition.test();
    }
}