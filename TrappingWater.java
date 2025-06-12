package hello;

public class TrappingWater {

	public static void main(String[] args) {
		int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = h.length, water = 0;
        int[] l = new int[n], r = new int[n];

        l[0] = h[0];
        for (int i = 1; i < n; i++)
            l[i] = Math.max(h[i], l[i - 1]);

        r[n - 1] = h[n - 1];
        for (int i = n - 2; i >= 0; i--)
            r[i] = Math.max(h[i], r[i + 1]);

        for (int i = 0; i < n; i++)
            water += Math.min(l[i], r[i]) - h[i];

        System.out.println(water);

	}

}
