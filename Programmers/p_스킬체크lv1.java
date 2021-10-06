class Solution {
    public int solution(String dartResult) {
        // �� ���忡�� ȹ���� ���� (�� 3�� ����)
        int[] round = new int[3];
        char[] carr = dartResult.toCharArray();
        // �ε��� ������ ���� -1���� ���� �� �ݺ����� �������Ѿ� �ϴµ� ù ��° �ݺ������� 0�� �ǵ���
        int idx = -1;
        for (int i=0;i<carr.length;i++) {
            // n��° ���忡 �� ������ 0~9�� ���
            if (carr[i] >= '0' && carr[i] <= '9') {
                idx++; // ���� ���忡�� ���� ����� ������ �� (-1 -> 0)
                // ���� �߰�
                round[idx] += Integer.parseInt(String.valueOf(carr[i]));
                // n��° ���忡 �� ������ 10���� ���
                if (i+1!=carr.length-1 && carr[i+1] == '0'&& carr[i] == '1') {
                    round[idx] -= Integer.parseInt(String.valueOf(carr[i]));
                    round[idx] = 10;
                    i++;                    
                }                
            } else if (carr[i] == 'D') { // ���ʽ� Double
                round[idx] *= round[idx]; // ����
            } else if(carr[i] == 'T') { // ���ʽ� Triple
                round[idx] *= round[idx] * round[idx]; // ������
            } else if (carr[i] == '*') { // ���� ����� ���� ���忡 *2
                if (idx > 0) round[idx-1] *=2;                
                round[idx] *= 2;
            } else if (carr[i] == '#') { // ���� ���忡 * -1                
                round[idx] *= -1;
            }
        }
        return round[0] + round[1] + round[2];
    }
}