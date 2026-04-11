//given a string consisting of opening and closing parentheses, determine if the parentheses are balanced. For example, the string "(()())" is balanced, while the string "(()" is not.if it is balanced,return 1 else return 0
//first argument is a string A
//output format- return 1 if the parentheses are balanced, else return 0
//ALgorithm
//1. if we have a opening bracket put into the stack
//2. if we have a closing bracket, pop the top element from the stack and check if it is a opening bracket. if not, return 0
//3. if the stack is empty at the end, return 1, else return 0  
//After processing the whole string, if the stack is empty, it means all parentheses are balanced, so we return 1. If the stack is not empty, it means there are unmatched opening parentheses, so we return 0.
//use for loop to iterate through the string and check each character
import java.util.Stack;
public class stack_question {
   