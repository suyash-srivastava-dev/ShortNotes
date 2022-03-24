# ArrayList

![image](https://user-images.githubusercontent.com/68404906/159867769-00dcf82d-dcfb-4103-96ca-c4b30fef8543.png)

1.  Define:

        ArrayList<Integer> al=new ArrayList<>();

2.  Sort:

         Collections.sort(al);

3.  Add/fetch elements:

        al.add(data);
        al.add(index,data);
        al.get(index); //return value
        al.indexOf(data);// return -1 if not present
        al.isEmpty();
        al.remove(data);
        al.remove(index);

4.  Remove element:

    Using remove() method by indexes(default)

        List<Integer> al = new ArrayList<>();

        // Adding elements to our ArrayList
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Printing the current ArrayList
        System.out.println(al);

        // This makes a call to remove(int) and
        // removes element 20
        al.remove(1);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al.remove(1);

    Using remove() method by values

        List<Integer> al = new ArrayList<>();

        // Adding elements to ArrayList class
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Printing the current ArrayList
        System.out.println(al);

        // This makes a call to remove(Object) and
        // removes element 1
        al.remove(new Integer(1));

        // This makes a call to remove(Object) and
        // removes element 2
        al.remove(new Integer(2));
