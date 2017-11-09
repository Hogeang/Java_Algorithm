

import java.util.*;

// ��� ����
public class Solution {
    public int[] keyData;

    void put(int size){
        Scanner scanner = new Scanner(System.in);
        keyData = new int[size];
        for(int i=0;i<size;i++){
            System.out.print((i+1) + "��° ���ڸ� �Է����ּ��� : ");
            keyData[i] = scanner.nextInt();
        } // ���� �Է¹޴´�.

    }

    int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2]; // �߰����� �ǹ����� �д�
        while (i <= j) { // ũ�ν� ������ ���� ������ ��� ���Ѵ�
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    void QuickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            QuickSort(arr, left, index - 1);
        if (index < right)
            QuickSort(arr, index, right);
    }

    public static void main(String[] args) {
        int size = 0; // size ũ�� ����
        Scanner scanner = new Scanner(System.in);

        System.out.print("����� �����մϴ� :");
        size = scanner.nextInt();

        Solution solution = new Solution();
        solution.put(size);
        solution.QuickSort(solution.keyData,0,size-1);


        for(int i=0;i<size;i++)
            System.out.print(solution.keyData[i]  + " ");
    }
}
