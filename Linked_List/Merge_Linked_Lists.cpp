#include <iostream>
using namespace std;
class ListNode
{
public:
    int val;
    ListNode *next;
};

class Solution {
    public:
        ListNode* mergeTwoLists(ListNode* head1, ListNode* head2) {
            ListNode* third = NULL;
            ListNode* last = NULL;
    
            if (head1 == NULL) return head2; 
            if (head2 == NULL) return head1; 
            
    
            if (head1->val <= head2->val) {
                third = head1;
                last = head1;
                head1 = head1->next;
            } else {
                third = head2;
                last = head2;
                head2 = head2->next;
            }
            
    
            while (head1 != NULL && head2 != NULL) {
                if (head1->val <= head2->val) {
                    last->next = head1;
                    last = head1;
                    head1 = head1->next;
                } else {
                    last->next = head2;
                    last = head2;
                    head2 = head2->next;
                }
            }
    
    
            if (head1 == NULL) {
                last->next = head2;
            } else {
                last->next = head1;
            }
    
            return third; 
        }
    };