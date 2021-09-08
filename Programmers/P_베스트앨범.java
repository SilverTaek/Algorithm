import java.util.*;

class Solution {
    static class Music {
        String genre;
        int play;
        int idx;
        
        public Music(String genre, int play, int idx){
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        ArrayList<String> genres_ordered = new ArrayList<>();
        
        while(map.size() != 0) {
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()) {
                int temp = map.get(key);
                if(temp > max) {max = temp;
                max_key = key;}
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
        
        ArrayList<Music> result = new ArrayList<>();
        for(String gen : genres_ordered){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++) {
                if(genres[i].equals(gen)){
                    list.add(new Music(gen, plays[i], i));
                }
            }
            
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            result.add(list.get(0));
            if(list.size() != 1){
                result.add(list.get(1));
            }
        }
        
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}