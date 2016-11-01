package exercises.exercise_13;

class WorkerThread extends Thread {
    private int[] arr;
    private int startIdx, stopIdx;
    private int result = 0;

    WorkerThread(int[] arr, int startIdx, int stopIdx) {
        this.arr = arr;
        this.startIdx = startIdx;
        this.stopIdx = stopIdx;
    }

    @Override
    public void run() {
        result = MaxValue.findMaxValue(arr, startIdx, stopIdx);
    }

    int getResult() {
        return result;
    }
}