This app implements priority queue (FIFO) where values are added depending on their priority. It takes .txt file as an
input where first line contains initial capacity. All remaining lines starts with either enqueue or dequeue. Program reads
line by line and add/removes from the queue elements depending on command in first column. First integer value in second
column is number value and second integer value in third column is priority of this number. If queue is full it must
check if last element has lower priority and if positive it must be removed.

Sample input:       Sample output:

3                   4 2
enqueue 5 3         3 1
enqueue 6 5         -2 0
enqueue 1 -1
dequeue
enqueue -2 0
dequeue
enqueue 3 1
enqueue 4 2