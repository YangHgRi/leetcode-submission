class Solution {
    public String replaceSpaces(String S, int length) {
        //�Ȱ��ַ���ת��Ϊ�ַ�����
        char[] chars = S.toCharArray();
        int index = chars.length - 1;
        for (int i = length - 1; i >= 0; i--) {
            //��������ո�Ͱ���ת��Ϊ"%20"
            if (chars[i] == ' ') {
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            } else {
                chars[index--] = chars[i];
            }
        }
        return new String(chars, index + 1, chars.length - index - 1);
    }
}
