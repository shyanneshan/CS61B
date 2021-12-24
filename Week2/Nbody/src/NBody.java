

/**
 * @author Shyanne Shan
 * @created 12/20/21/12/2021 - 2:35 PM
 */
public class NBody {


    public static void main(String[] args){
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        Body[] bodies = readBodies(filename);
        double radius = readRadius(filename);
        String imageToDraw = "images/starfield.jpg";

        StdDraw.enableDoubleBuffering();

        /** Sets up the universe so it goes from
         * -100, -100 up to 100, 100 */
        StdDraw.setScale(-radius, radius);

        /* Clears the drawing window. */
        StdDraw.clear();

        /* Stamps three copies of advice.png in a triangular pattern. */
        StdDraw.picture(0, 75, imageToDraw);
        StdDraw.picture(-75, -75, imageToDraw);
        StdDraw.picture(75, -75, imageToDraw);


        for (double time = 0; time < T; time += dt){
            double[] xForces = new double[bodies.length];
            double[] yForces = new double[bodies.length];
            int index = 0;
            for (Body body:bodies) {
                xForces[index] = body.calcNetForceExertedByX(bodies);
                yForces[index] = body.calcNetForceExertedByY(bodies);
                index += 1;
            }
            index = 0;
            for (Body body:bodies) {
                body.update(dt, xForces[index], yForces[index]);
                index += 1;
            }
            for (Body body:bodies){
                StdDraw.picture(body.xxPos, body.yyPos, "images/"+body.imgFileName);
                StdDraw.show();
            }
            StdDraw.pause(10);
        }

    }

    public static double readRadius(String fileName){
        In in = new In(fileName);

        int number = in.readInt();

        return in.readDouble();
    }

    public static Body[] readBodies(String fileName){
        In in = new In(fileName);
        int number = in.readInt();
        double radius = in.readDouble();
        Body[] result = new Body[number];
        for(int index = 0; index < number; index+=1){
            double xxPos = in.readDouble();
            double yyPos = in.readDouble();
            double xxVel = in.readDouble();
            double yyVel = in.readDouble();
            double mass = in.readDouble();
            String imgFileName = in.readString();
            result[index] = new Body(xxPos, yyPos, xxVel, yyVel, mass, imgFileName);
        }
        return result;
    }
}
