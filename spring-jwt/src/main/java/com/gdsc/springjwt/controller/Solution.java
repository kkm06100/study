package com.gdsc.springjwt.controller;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        d = Arrays.stream(d).sorted().toArray();
        for(int i = 0;i<d.length;i++){
            answer += budget % d[i];
            budget/=d[i];
        }
        return answer;
    }
}