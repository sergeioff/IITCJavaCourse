package exercises.exercise_14_1.task1;

import static exercises.exercise_14_1.task1.Task1.getNumberOfDivisors;

/**
 * @see Task1
 */
class CountDivisorsThread extends Thread {
    private int leftBound;
    private int rightBound;
    private int result;

    CountDivisorsThread(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    @Override
    public void run() {
        int maxNumber = leftBound;
        int divisorsCount = getNumberOfDivisors(leftBound);

        for (int i = leftBound; i <= rightBound; i++) {
            int divisors = getNumberOfDivisors(i);

            if (divisors > divisorsCount) {
                divisorsCount = divisors;
                maxNumber = i;
            }
        }

        result = maxNumber;
    }

    public int getResult() {
        return result;
    }
}