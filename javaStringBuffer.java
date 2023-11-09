public class javaStringBuffer {
    public static void main(String[] args) throws Exception {
        // CREATING THE STRING BUFFER
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // 1. append() METHOD
        stringBuffer.append(" KARMAKAR");
        System.out.println("After append() -> " + stringBuffer);

        // 2. insert() METHOD
        stringBuffer.insert(6, " SUVJAIT");
        System.out.println("After insert() -> " + stringBuffer);

        // 3. replace() METHOD
        stringBuffer.replace(6, 10, "UNIVERSE");
        System.out.println("After replace() -> " + stringBuffer);

        // 4. delete() METHOD
        stringBuffer.delete(6, 15);
        System.out.println("After delete() -> " + stringBuffer);

        // 5. charAt() METHOD
        char charAtIndex = stringBuffer.charAt(2);
        System.out.println("charAt(2) -> " + charAtIndex);

        // 6. setCharAt() METHOD
        stringBuffer.setCharAt(0, 'M');
        System.out.println("After setCharAt() -> " + stringBuffer);

        // 7. length() METHOD
        int length = stringBuffer.length();
        System.out.println("Length -> " + length);

        // 8. capacity() METHOD
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity -> " + capacity);

        // 9. ensureCapacity() METHOD
        stringBuffer.ensureCapacity(20);
        System.out.println("After ensureCapacity() -> " + stringBuffer);

        // 10. toString() METHOD
        String stringRepresentation = stringBuffer.toString();
        System.out.println("toString() -> " + stringRepresentation);

        // 11. substring(int start) METHOD
        String substring1 = stringBuffer.substring(6);
        System.out.println("substring(6) -> " + substring1);

        // 12. substring(int start, int end) METHOD
        String substring2 = stringBuffer.substring(0, 5);
        System.out.println("substring(0, 5) -> " + substring2);
    }
}

