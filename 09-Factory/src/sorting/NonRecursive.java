package sorting;

public class NonRecursive extends SortFactory {
    @Override
    public SortingAlgorithm getAlgorithm() {
        return new SelectionSort();
    }
}
