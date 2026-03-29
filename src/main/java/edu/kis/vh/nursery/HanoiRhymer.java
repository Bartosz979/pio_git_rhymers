package edu.kis.vh.nursery;

/**
 * A specialized implementation of {@link DefaultCountingOutRhymer} that enforces
 * a constraint similar to the Tower of Hanoi problem.
 * <p>
 * Elements can only be added if they are less than or equal to the current
 * top element (as returned by {@code peekaboo()}). If a larger element is
 * attempted to be added, it is rejected and counted.
 * </p>
 *
 * <p>
 * This class keeps track of how many elements were rejected due to violating
 * this ordering rule.
 * </p>
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * The number of elements that were rejected because they violated
     * the ordering constraint.
     */
    int totalRejected = 0;

    /**
     * Returns the total number of rejected elements.
     *
     * @return the number of rejected {@code countIn} attempts
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Attempts to add a new element to the rhymer.
     * <p>
     * If the rhymer is not empty and the new element is greater than the
     * current top element, the value is rejected and the rejection counter
     * is incremented. Otherwise, the element is added normally.
     * </p>
     *
     * @param in the integer value to be added
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
