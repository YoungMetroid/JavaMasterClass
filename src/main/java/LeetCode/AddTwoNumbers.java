package LeetCode;


import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args){

        ListNode value1 = new ListNode(2);
        ListNode value2 = new ListNode(4);
        ListNode value3 = new ListNode(3);
        ListNode value4 = new ListNode(5);
        ListNode value5 = new ListNode(6);
        ListNode value6 = new ListNode(4);

        ListNode firstNumber = value1;
        ListNode secondNumber = value4;

        value1.next = value2;
        value2.next = value3;

        value4.next = value5;
        value5.next = value6;




        while(value1 != null)
        {
            System.out.print(value1.val);
            value1 = value1.next;
        }
        System.out.println();
        while(value4 != null)
        {
            System.out.print(value4.val);
            value4 = value4.next;
        }

        System.out.println();
        ListNode fasterResult = addTwoNumbersFaster(firstNumber,secondNumber);
        while(fasterResult != null)
        {
            System.out.print(fasterResult.val);
            fasterResult = fasterResult.next;
        }
        System.out.println();


/*
        ListNode result = addTwoNumbers(firstNumber,secondNumber);
        while(result != null){
            System.out.print(result.val);
            result = result.next;
        }
*/
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode firstNumber, ListNode secondNumber){
        String numberOne = getNumber(firstNumber);
        String numberTwo = getNumber(secondNumber);

        int result1 = Integer.valueOf(numberOne);
        int result2 = Integer.valueOf(numberTwo);
        int finalResult = result1 + result2;

        String stringResult = String.valueOf(finalResult);
        stringResult = new StringBuilder(stringResult).reverse().toString();

        ListNode anchor = new ListNode();
        ListNode finalNode = anchor;
        for(int i = 0; i < stringResult.length(); i++){
            anchor.val = Integer.valueOf(Character.toString(stringResult.charAt(i)));
            if(i+1 < stringResult.length()) {
                anchor.next = new ListNode();
                anchor = anchor.next;
            }
        }
        return finalNode;
    }
    public static ListNode addTwoNumbersFaster(ListNode firstNumber, ListNode secondNumber)
    {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(firstNumber != null || secondNumber != null)
        {
            int x = (firstNumber != null) ? firstNumber.val : 0;
            int y = (secondNumber != null) ? secondNumber.val :0;

            int sum  = x + y + carry;
            carry = sum / 10;
            curr.val = sum % 10;

            if(firstNumber != null) firstNumber = firstNumber.next;
            if(secondNumber != null) secondNumber = secondNumber.next;
            if(firstNumber != null || secondNumber!= null || carry > 0)
            {
                    curr.next = new ListNode();
                    curr = curr.next;
            }
        }
        if(carry> 0)
        {
            curr.val = carry;
        }

        return dummyHead;
    }
    public static String getNumber(ListNode number){
        String numberList = new String();
        while(number != null){
            numberList = numberList.concat(Integer.toString(number.val));
            number = number.next;
        }
        return new StringBuilder(numberList).reverse().toString();
    }
}
