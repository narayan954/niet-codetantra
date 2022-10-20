class Evaluate:
	def __init__(self,capacity):
		self.top=-1
		self.capacity=capacity
		self.array=[]
	def isEmpty(self):
		return True if self.top==-1 else False
	def peek(self):
		return self.array[-1]
	def pop(self):
		if not self.isEmpty():
			self.top-=1
			return self.array.pop()
		else:
			return "$"
	def push(self,op):
		self.top+=1
		self.array.append(op)
	def evaluate(self,exp):
		for i in exp:
			if i.isdigit():
				self.push(i)
			else:
				val1=self.pop()
				val2=self.pop()
				self.push(str(eval(val2+i+val1)))
		return float(self.pop())
exp=input("Enter Postfix expression")
obj=Evaluate(len(exp))
print("Result of Postfix expression",exp,"is",int((obj.evaluate(exp))))
