This app implements priority queue (FIFO) where values are added depending on their priority. It takes .txt file as an input where first line contains initial capacity. All remaining lines starts with either enqueue or dequeue. Program reads line by line and add/removes from the queue elements depending on command in first column. First integer value in second column is number value and second integer value in third column is priority of this number. If queue is full it must
check if last element has lower priority and if positive it must be removed.

Sample input:

3<br/>
enqueue 5 3<br/>
enqueue 6 5<br/>
enqueue 1 -1<br/>
dequeue<br/>
enqueue -2 0<br/>
dequeue<br/>
enqueue 3 1<br/>
enqueue 4 2<br/>

Sample output:

4 2<br/>
3 1<br/>
-2 0<br/>
