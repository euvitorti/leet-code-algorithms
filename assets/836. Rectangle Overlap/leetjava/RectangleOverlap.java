package leetjava;

class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Verifica se um retângulo está à esquerda ou à direita do outro
        boolean noOverlap = rec1[2] <= rec2[0] || rec2[2] <= rec1[0] ||
                rec1[3] <= rec2[1] || rec2[3] <= rec1[1];

        // Se não há sobreposição, retorna falso; caso contrário, retorna verdadeiro
        return !noOverlap;
    }
}
