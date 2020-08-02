#include <stdio.h>
#include "linked_list.h"

linked_list_t linkedList;

void linked_list_add_first(int data)   // add 'data' at the beginning of list
{
	node* temp;
	temp = malloc(sizeof(temp));
	if (linkedList.head == NULL) {
		linkedList.head = temp;
		temp->next = NULL;
		temp->data = data;
	}
	else {
		temp->next = linkedList.head;
		temp->data = data;
		linkedList.head = temp;
	}
	linkedList.size++;	
}

void linked_list_add_last(int data)    // add 'data' at the end of list
{
	node* temp = malloc(sizeof(temp));
	temp->data = data;
	temp->next = NULL;
	node* search = linkedList.head;
	for (; search->next!= NULL; ) {
		search = search->next;
	}
	search->next = temp;
	linkedList.size++;

	return;
}

int linked_list_get_first()            // return 'data' of first item
{
	if (linkedList.head->next == NULL) {
		printf("It can't be deleted");
		return -1;
	}
	return linkedList.head->next->data;
}

int linked_list_get_last()             // return 'data' of last item
{
	if (linkedList.head->next == NULL) {
		printf("It is empty");
		return -1;
	}
	node* i = linkedList.head->next;
	for (; i->next != NULL;) {
		i = i->next;
	}
	return i->data;
}

void linked_list_delete_first()        // delete first item
{
	node* temp=malloc(sizeof(temp));
	temp = linkedList.head;
	linkedList.head = temp->next;
	free(temp);
	linkedList.size--;
}

void linked_list_delete_last()         // delete last item
{
	node* temp;
	node* i = linkedList.head;
	for (; i->next->next != NULL;) {
		i = i->next;
	}
	temp = i->next;
	i->next = NULL;
	free(temp);
	linkedList.size--;

}

int linked_list_size()                 // return the number of items in list
{
	return linkedList.size;
}

int linked_list_exist(int data)        // find 'data'. return true(1)/false(0)
{
	node* temp=linkedList.head->next;
	for (; temp != NULL;) {
		if (temp->data = data) {
			return 1;
		}
	}
	return 0;
}

void linked_list_delete(int data)      // find 'data' in the list, and delete
{
	node* searchnode=linkedList.head->next;
	node* prenode=linkedList.head;
	for (; prenode->next != NULL;) {
		if (searchnode->data = data) {
			prenode->next = searchnode->next;
			free(searchnode);
			linkedList.size--;
			return NULL;
		}
		prenode = prenode->next;
		searchnode = searchnode->next;
	}


}

void linked_list_delete_index(int i)   // delete 'i'-th item in the list
{
	node* prenode=linkedList.head;
	node* temp = linkedList.head->next;
	if (temp == NULL) {
		printf("list is empty");
	}
	else {
		for (int n = 0; n < i - 1; n++) {
			prenode = prenode->next;
			temp = temp->next;
		}
		prenode->next = temp->next;
		free(temp);
		linkedList.size--;
	}	
	
}

void linked_list_delete_all()          // delete all data
{
	node* temp;
	node* freenode;
	temp = linkedList.head->next;
	while (temp != NULL) {
		freenode = temp;
		temp = temp->next;
		free(freenode);
		linkedList.size--;
	}
	linkedList.head->next = NULL;
}

void linked_list_print()               // print all data in the list
{
	node* print = linkedList.head->next;
	for (; print != NULL; print = print->next) {
		printf("%d\n", print->data);
	}
}

