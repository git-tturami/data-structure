# Stack

Stack is data structure which element <b>comes first, and get out last.</b>
This is examples of stack.

### Push
Push is the function which `pushes` some element or object into the stack.
Before push, stack <b>*have to check whether stack is full or not.*</b>

### Pop
Pop is the function which `pop` some element or object into the stack.
Before pop, stack <b>*have to check whether stack is empty or not.*</b>

#### isFull
isFull checks whether stack is full or not.
If <b>stack's top equals stack size</b>, stack is full.

#### isEmpty
isEmpty checks whether stack is empty or not.
If <b>stack's top equals -1</b>, stack is empty.

#### Example
```
Init
top = -1
```
Push(1)
```
1
^
top = 0
```
Push(2)
```
1 2
  ^
  top = 1
```
Push(3)
```
1 2 3
    ^
    top = 2
```
Pop()
```
1 2
  ^
  top = 1
```
Pop()
```
1
^
top = 0
```
