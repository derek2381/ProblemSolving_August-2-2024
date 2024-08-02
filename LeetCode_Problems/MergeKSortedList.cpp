// problem link
// https://leetcode.com/problems/merge-k-sorted-lists/description/


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    static bool compare(ListNode* x, ListNode* y){
        return x->val > y->val;
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        ListNode* dummy = new ListNode(-999);
        ListNode* last = dummy;

        priority_queue<ListNode*, vector<ListNode*>, decltype(this->compare)> pq(this->compare);

        for(ListNode* i : lists){
            while(i != nullptr){
                pq.push(i);
                i = i->next;
            }
        }

        while(!pq.empty()){
            last->next = pq.top();

            last = last->next;
            last->next = nullptr;
            pq.pop();
        }

        return dummy->next;

    }
};