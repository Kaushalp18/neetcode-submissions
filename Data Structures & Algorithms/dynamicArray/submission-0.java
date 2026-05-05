class DynamicArray {

    private int[] arr;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        return arr[--size];
    }

    private void resize() {
        int capacityNew = 2*capacity;
        int arrNew[] = new int[capacityNew];
        for(int i = 0; i<size; i++){
            arrNew[i] = arr[i];
        }
        this.arr = arrNew;
        this.capacity = capacityNew;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
