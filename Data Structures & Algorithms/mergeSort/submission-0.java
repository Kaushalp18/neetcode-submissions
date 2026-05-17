class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if (pairs.size() <= 1) return pairs;
        mergeSort(pairs, 0, pairs.size() - 1);
        return pairs;
    }

    private List<Pair> mergeSort(List<Pair> pairs, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(pairs, l, mid);
            mergeSort(pairs, mid + 1, r);

            merge(pairs, l, mid, r);
        }

        return pairs;
    }

    private List<Pair> merge(List<Pair> pairs, int l, int mid, int r) {
        int lsize = mid - l + 1;
        int rsize = r - mid;

        List<Pair> leftArr = new ArrayList<>(lsize);
        List<Pair> rightArr = new ArrayList<>(rsize);

        for (int i = 0; i < lsize; i++) {
            leftArr.add(i, pairs.get(l + i));
        }

        for (int j = 0; j < rsize; j++) {
            rightArr.add(j, pairs.get(mid + 1 + j));
        }

        int leftHead = 0;
        int rightHead = 0;
        int i = l;

        while (leftHead < lsize && rightHead < rsize) {
            if (leftArr.get(leftHead).key <= rightArr.get(rightHead).key) {
                pairs.set(i, leftArr.get(leftHead));
                leftHead++;
            } else {
                pairs.set(i, rightArr.get(rightHead));
                rightHead++;
            }
            i++;
        }

        while(leftHead < lsize){
            pairs.set(i, leftArr.get(leftHead));
            leftHead++;
            i++;
        }

        while(rightHead < rsize){
            pairs.set(i, rightArr.get(rightHead));
            rightHead++;
            i++;
        }

        return pairs;
    }
}