


typedef struct {
    int in[100];
    int out[100];

    int topIn;
    int topOut
}MyQueue;


MyQueue* myQueueCreate() {
    MyQueue * q = (MyQueue*)malloc(sizeof(MyQueue));
    q->topIn = -1;
    q->topOut = -1;

    return q;
}

void myQueuePush(MyQueue* obj, int x) {
    obj->in[++obj->topIn] = x;
}

int myQueuePop(MyQueue* obj) {
    if(obj->topOut == -1){
        while(obj->topIn != -1){
            obj->out[++obj->topOut] = obj->in[obj->topIn--];
        }
    }
    return obj->out[obj->topOut--];
}

int myQueuePeek(MyQueue* obj) {
    if(obj->topOut == -1){
        while(obj->topIn != -1){
            obj->out[++obj->topOut] = obj->in[obj->topIn--];
        }
    }
    return obj->out[obj->topOut];
}

bool myQueueEmpty(MyQueue* obj) {
    return obj->topIn == -1 && obj->topOut == -1;
}

void myQueueFree(MyQueue* obj) {
    free(obj);
}

/**
 * Your MyQueue struct will be instantiated and called as such:
 * MyQueue* obj = myQueueCreate();
 * myQueuePush(obj, x);
 
 * int param_2 = myQueuePop(obj);
 
 * int param_3 = myQueuePeek(obj);
 
 * bool param_4 = myQueueEmpty(obj);
 
 * myQueueFree(obj);
*/