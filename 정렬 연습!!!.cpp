#include<stdio.h>

/*
1. ���� ������ ã��
2. ã�� �ڸ� �ٲٱ�

���� 
1. ��ȯȽ���� ����
2. 

����
1. �������� �����ϴ�
2. ��뷮 �����Ϳ��� �������� �ʴ� 
*/
void selectionSort(int arr[], int length){
	
	int tempNumber;
	for(int i = 0; i < length; i++){ // ���� �� 
		int temp = i;
		for(int j = i; j< length; j++){ // ���� ������ ������ ��� �� ��ȸ 
			if(arr[temp] > arr[j]){
				temp = j;
			}
		}
		tempNumber = arr[i];
		arr[i] = arr[temp];
		arr[temp] = tempNumber;

	}
	printf("seletionSort: ");
	for(int i = 0; i < length; i++){ // ��� 
		printf("%d ",arr[i]);
	}
	printf("\n");
}

/*
1. ������� ���� 1ū ���ҿ� ��
2. ������Ұ� �� ũ�� �ٲ�
3. 1, 2 �ܰ� length - 1��ŭ �ݺ��ϱ� 

����
1. ������ �����ϴ�
2. �߰����� �޸� ������ �ʿ����� �ʴ� 

����
1. ������ ��ȯȽ���� ����
2. ��뷮 �����Ϳ��� �������� �ʴ�.
 
*/
void bubbleSort(int arr[], int length){
	int temp = 0;
	for(int i = 0; i < length; i++){
		for(int j = 0; j < length-1; j++){
			if(arr[j]>arr[j+1]){
			temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			}
		}
	}
	printf("bubbleSort: ");
	for(int i = 0; i < length; i++){ // ��� 
		printf("%d ",arr[i]);
	}
	printf("\n");
} 

/*
1. 1��° �ε������� ����(0��° �ε����� ���ĵǾ��ٰ� ����)
2. (�����ε��� - 1) ��°�� �ִ� ���ҿ� ���ؼ� ���� �ε����� �� ������ �ڸ� �ٲٱ�

���� 
1. ���ĵ��ִ� �������� ��� O(n)�� �ð� ���⵵�� �ɸ���
2. �߰����� �޸𸮰� �ʿ����� �ʴ� 

����
1. �������� ���¿� ���� ������ ũ��
2. ��Ը� ���Ŀ��� �������� �ʴ�
 
*/
void insertionSort(int arr[], int length){
	int temp;
	for(int i = 1; i < length; i++){
		for(int j = i-1; j >= 0; j--){
			if(arr[i] < arr[j]){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}else{
				break;
			}
		}
	
	}
	
	printf("insertionSort: ");
	for(int i = 0; i < length; i++){ // ��� 
		printf("%d ",arr[i]);
	}
	printf("\n");
}


// QuickSort �Լ�
void quickSort(int arr[], int start, int end) {
	end -= 1;
    if (start >= end) {
        return; // ���� ����
    }

    int pivot = arr[start + (end - start) / 2]; // �ǹ� �� ����
    int left = start;
    int right = end;

    // �迭�� �ǹ� �������� ����
    while (left <= right) {
        while (arr[left] < pivot) {
            left++;
        }
        while (arr[right] > pivot) {
            right--;
        }
        if (left <= right) {
            // left�� right�� ��Ҹ� ��ȯ
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // ��� ȣ��� �¿� ���� ����
    quickSort(arr, start, right);
    quickSort(arr, left, end);
}


int main(){
	
	int arr[10] = {7,3,8,5,10,2,9,1,4,6};
	selectionSort(arr, 10);
	bubbleSort(arr, 10);
	insertionSort(arr, 10);
	quickSort(arr, 0, 10);
	
	printf("quickSort: ");
	for(int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++){ // ��� 
		printf("%d ",arr[i]);
	}
	printf("\n");
}
