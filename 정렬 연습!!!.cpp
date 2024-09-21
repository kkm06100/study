#include<stdio.h>

/*
1. 제일 작은거 찾기
2. 찾고 자리 바꾸기

장점 
1. 교환횟수가 적다
2. 

단점
1. 적응성이 부족하다
2. 대용량 데이터에는 적합하지 않다 
*/
void selectionSort(int arr[], int length){
	
	int tempNumber;
	for(int i = 0; i < length; i++){ // 기준 값 
		int temp = i;
		for(int j = i; j< length; j++){ // 기준 값으로 부터의 모든 값 순회 
			if(arr[temp] > arr[j]){
				temp = j;
			}
		}
		tempNumber = arr[i];
		arr[i] = arr[temp];
		arr[temp] = tempNumber;

	}
	printf("seletionSort: ");
	for(int i = 0; i < length; i++){ // 출력 
		printf("%d ",arr[i]);
	}
	printf("\n");
}

/*
1. 현재원소 보다 1큰 원소와 비교
2. 현재원소가 더 크면 바꿈
3. 1, 2 단계 length - 1만큼 반복하기 

장점
1. 구현이 간단하다
2. 추가적인 메모리 공간이 필요하지 않다 

단점
1. 데이터 교환횟수가 많다
2. 대용량 데이터에는 적합하지 않다.
 
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
	for(int i = 0; i < length; i++){ // 출력 
		printf("%d ",arr[i]);
	}
	printf("\n");
} 

/*
1. 1번째 인덱스부터 진행(0번째 인덱스는 정렬되었다고 가정)
2. (현재인덱스 - 1) 번째에 있는 원소와 비교해서 현재 인덱스가 더 작으면 자리 바꾸기

장점 
1. 정렬돼있는 데이터인 경우 O(n)의 시간 복잡도가 걸린다
2. 추가적인 메모리가 필요하지 않다 

단점
1. 데이터의 상태에 따라 편차가 크다
2. 대규모 정렬에는 적합하지 않다
 
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
	for(int i = 0; i < length; i++){ // 출력 
		printf("%d ",arr[i]);
	}
	printf("\n");
}


// QuickSort 함수
void quickSort(int arr[], int start, int end) {
	end -= 1;
    if (start >= end) {
        return; // 종료 조건
    }

    int pivot = arr[start + (end - start) / 2]; // 피벗 값 설정
    int left = start;
    int right = end;

    // 배열을 피벗 기준으로 분할
    while (left <= right) {
        while (arr[left] < pivot) {
            left++;
        }
        while (arr[right] > pivot) {
            right--;
        }
        if (left <= right) {
            // left와 right의 요소를 교환
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 재귀 호출로 좌우 구간 정렬
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
	for(int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++){ // 출력 
		printf("%d ",arr[i]);
	}
	printf("\n");
}
