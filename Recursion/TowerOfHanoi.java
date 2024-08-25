public class TowerOfHanoi {
    // Recursive method to solve the Tower of Hanoi problem
    public void solve(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        // Move n-1 disks from fromRod to auxRod using toRod as auxiliary
        solve(n - 1, fromRod, auxRod, toRod);
        
        // Move the nth disk from fromRod to toRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        // Move n-1 disks from auxRod to toRod using fromRod as auxiliary
        solve(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.solve(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
