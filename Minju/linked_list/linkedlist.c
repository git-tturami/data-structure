#include <stdio.h>
#include <stdlib.h>

#include "linked_list.h"

linked_list_t linked_list;

void linked_list_add_first(int data) {   // add 'data' at the beginning of list
	node* tmp;
	tmp = (node*)malloc(sizeof(node));
	tmp->next = linked_list.head;
	tmp->data = data;
	linked_list.size++;
	linked_list.head = tmp;
}

void linked_list_add_last(int data) {    // add 'data' at the end of list
	node* ptr = linked_list.head;;
	node* tmp = (node*)malloc(sizeof(node));
	tmp->data = data;
	tmp->next = NULL;

	for(;;){
		if (ptr->next == NULL)
			break;
		ptr = ptr->next;
	}
	ptr->next = tmp;
	linked_list.size++;

}

int linked_list_get_first() {            // return 'data' of first item
	node* ptr = linked_list.head;
	if (ptr == NULL) {
		printf("empty");
		return -1;
	}
	return ptr->data;
}

int linked_list_get_last() {             // return 'data' of last item
	node* ptr = linked_list.head;
	if (ptr == NULL) {
		printf("empty");
		return -1;
	}
	while (ptr->next != NULL) {
		ptr = ptr->next;
	}
	return ptr->data;
}

void linked_list_delete_first() {        // delete first item
	node* tmp = linked_list.head;
	linked_list.head = linked_list.head->next;
	free(tmp);
	linked_list.size--;
}

void linked_list_delete_last() {         // delete last item
	node* prev = linked_list.head;
	node* curr = prev->next;
	while (1) {
		if (curr == NULL) {
			break;
		}
		if (curr->next == NULL) {
			prev->next = NULL;
			free(curr);
			break;
		}
		prev = prev->next;
		curr = curr->next;
	}
	linked_list.size--;
}

int linked_list_size() {	            // return the number of items in list
	return linked_list.size;
}

int linked_list_exist(int data) {        // find 'data'. return true(1)/false(0)
	node* ptr = linked_list.head;
	while (ptr != NULL) {
		if (ptr->data == data)
			return 1;
		ptr = ptr->next;
	}
	return 0;
}

void linked_list_delete(int data) {      // find 'data' in the list, and delete
	node* prev = linked_list.head;
	node* curr = prev->next;
	while (prev != NULL) {
		if (prev->data == data) {
			linked_list.head = curr;
			free(prev);
			break;
		}
		if (curr->data == data) {
			prev->next = curr->next;
			free(curr);
			break;
		}
		prev = prev->next;
		curr = curr->next;
	}
	linked_list.size--;
}

void linked_list_delete_index(int i) {   // delete 'i'-th item in the list
	node* ptr = linked_list.head;
	node* tmp = linked_list.head;
	if (linked_list.size == 0)
		return;
	for (int count = 0; count < i - 1; count++) {
		tmp = ptr;
		ptr = ptr->next;
	} 
	tmp->next = ptr->next;
	if (i == 1)
		linked_list.head = tmp->next;
	free(ptr);
	linked_list.size--;
}

void linked_list_delete_all() {          // delete dall data
	node* tmp = linked_list.head;
	node* ptr = linked_list.head->next;
	while (1) {
		free(tmp);
		if (ptr == NULL) {
			linked_list.head = NULL;
			linked_list.size = 0;
			break;
		}
		tmp = ptr;
		ptr = ptr->next;
	}
	linked_list.size = 0;
}

void linked_list_print() {
	node* tmp = linked_list.head;
	while (tmp != NULL) {
		printf("%d\n", tmp->data);
		tmp = tmp->next;
	}
}