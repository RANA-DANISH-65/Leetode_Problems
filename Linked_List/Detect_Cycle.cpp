#include <iostream>
using namespace std;

class ListNode
{
public:
    int val;
    ListNode *next;
};

bool detectCycle(ListNode *head)
{
    ListNode *slow = head, *fast = head;
    while (fast && fast->next)
    {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast)
        {
            return true;
        }
    }
    return false;
}

