/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #01 Exercise #03
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 the centers and dimensions of two
 rectangles and determines if they
 overlap or are inside each other.

 *************************************/

public class Hw1_Ex3 {
    public static void main(String[] args) {
        boolean overlap, r1inside, r2inside;
        double r1x, r1y, r1w, r1h; // the center (x,y) and width and height of rectangle 1
        double r1xl, r1xr, r1yt, r1yb; // the left-right and top-bottom bounds of rectangle 1
        double r2x, r2y, r2w, r2h; // the center (x,y) and width and height of rectangle 2
        double r2xl, r2xr, r2yt, r2yb; // the left-right and top-bottom bounds of rectangle 2
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input for rectangle 1
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        r1x = input.nextDouble();
        r1y = input.nextDouble();
        r1w = input.nextDouble();
        r1h = input.nextDouble();

        // calculates bounds for rectangle 1
        r1xl = r1x - (r1w / 2);
        r1xr = r1x + (r1w / 2);
        r1yb = r1y - (r1h / 2);
        r1yt = r1y + (r1h / 2);

        // takes in user input for rectangle 2
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        r2x = input.nextDouble();
        r2y = input.nextDouble();
        r2w = input.nextDouble();
        r2h = input.nextDouble();

        // calculates bounds for rectangle 2
        r2xl = r2x - (r2w / 2);
        r2xr = r2x + (r2w / 2);
        r2yb = r2y - (r2h / 2);
        r2yt = r2y + (r2h / 2);

        // checks for overlap and if rectangles are inside each other
        overlap = checkOverlap(r1xl, r1xr, r1yb, r1yt, r2xl, r2xr, r2yb, r2yt);
        r1inside = checkInside(r1xl, r1xr, r1yb, r1yt, r2xl, r2xr, r2yb, r2yt);
        r2inside = checkInside(r2xl, r2xr, r2yb, r2yt, r1xl, r1xr, r1yb, r1yt);

        // program output
        if (r1inside)
            System.out.print("r1 is inside r2");
        else if (r2inside)
            System.out.print("r2 is inside r1");
        else if (overlap)
            System.out.print("r2 overlaps r1");
        else
            System.out.print("r2 does not overlap r1");
    } // end main()

    // checks if there is overlap between two rectangles
    public static boolean checkOverlap(double r1xl, double r1xr, double r1yb, double r1yt, double r2xl, double r2xr, double r2yb, double r2yt) {
        // checks for horizontal overlap
        if(((r1xl < r2xl) && (r2xl < r1xr)) || ((r1xr > r2xr) && (r2xr > r1xl))) {
            // vertical bounds must overlap or be inside each other
            if (r1yt > r2yb || r1yb < r2yt)
                return true;
        }
        // checks for vertical overlap
        if(((r1yb < r2yb) && (r2yb < r1yt)) || ((r1yt > r2yt) && (r2yt > r1yb))) {
            // horizontal bounds must overlap or be inside each other
            if (r1xr > r2xl || r1xl < r2xr)
                return true;
        }
        return false; // if there is no overlap
    } // end checkOverlap()

    // checks if a r1 contains r2, can swap order in which arguements are passed to check converse
    public static boolean checkInside(double r1xl, double r1xr, double r1yb, double r1yt, double r2xl, double r2xr, double r2yb, double r2yt) {
        return (r1xl >= r2xl && r1xr <= r2xr && r1yb >= r2yb && r1yt <= r2yt);
    } // end checkInside()
}