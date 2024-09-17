
class SB {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Krish");
        System.out.println(sb.capacity());

        sb.append("Vadhani");

        System.out.println(sb);

        String s1 = sb.toString();
    }

}
