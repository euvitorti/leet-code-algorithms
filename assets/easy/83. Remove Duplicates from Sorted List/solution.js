/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {

    // PT: Começamos pelo primeiro nó da lista.
    // EN: We start at the first node of the list.
    let current = head;

    // PT: Continuamos enquanto o nó atual e o próximo existirem.
    // EN: We continue while the current node and the next node exist.
    while (current !== null && current.next !== null) {

        // PT: Verificamos se o número atual é igual ao próximo.
        // EN: We check if the current number is equal to the next one.
        if (current.val === current.next.val) {

            // PT: Se forem iguais, pulamos o próximo nó.
            // EN: If they are equal, we skip the next node.
            // PT: Assim, removemos a duplicata sem criar outra lista.
            // EN: This removes the duplicate without creating another list.
            current.next = current.next.next;

        } else {

            // PT: Se forem diferentes, avançamos para o próximo nó.
            // EN: If they are different, we move to the next node.
            current = current.next;
        }
    }

    // PT: Retornamos o início da lista, agora sem duplicatas.
    // EN: We return the beginning of the list, now without duplicates.
    return head;
};