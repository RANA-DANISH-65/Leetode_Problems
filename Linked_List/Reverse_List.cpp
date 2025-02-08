#include <iostream>
using namespace std;

class ListNode
{
public:
    int val;
    ListNode *next;
};

void reverse(ListNode *head)
{
    ListNode *r = nullptr;
    ListNode *p = head;
    ListNode *q = nullptr;

    while (p)
    {
        r = q;
        q = p;
        p = p->next;
        q->next = r;
    }
    head = q;
}