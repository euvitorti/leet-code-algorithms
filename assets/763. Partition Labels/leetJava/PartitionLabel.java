package leetjava;

class PartitionLabel {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurrence = new int[26];

        // Armazenar a última ocorrência de cada letra
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int currentEnd = 0;
        int partitionStart = 0;

        for (int i = 0; i < s.length(); i++) {
            currentEnd = Math.max(currentEnd, lastOccurrence[s.charAt(i) - 'a']);
            
            if (i == currentEnd) {
                result.add(currentEnd - partitionStart + 1);
                partitionStart = i + 1; // Atualiza o início da próxima partição
            }
        }
        return result;
    }
}