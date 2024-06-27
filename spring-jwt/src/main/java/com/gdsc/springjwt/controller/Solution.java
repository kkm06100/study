import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> peoples = Arrays.stream(people).sorted().boxed().collect(Collectors.toList());
        while(peoples.size()>0){
            if(peoples.get(0) + peoples.get(peoples.size()-1)<=limit){
                peoples.remove(0);
                peoples.remove(peoples.size()-1);
                answer ++;
            }
            else {
                peoples.remove(peoples.size());
                answer++;
            }
        }


        return answer;
    }
}