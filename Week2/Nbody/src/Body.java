/**
 * @author Shyanne Shan
 * @created 12/19/21/12/2021 - 11:27 PM
 */
public class Body {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    String imgFileName;


    public Body(double xP, double yP, double xV,
                double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;

    }

    public Body(Body b){
        xxPos = b.xxPos;
        xxVel = b.xxVel;
        yyPos = b.yyPos;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;

    }

    public double calcDistance(Body b){
        double rx2 = Math.pow(b.xxPos - xxPos, 2);
        double ry2 = Math.pow(b.yyPos - yyPos, 2);
        double r = Math.sqrt(rx2 + ry2);
        return r;
    }

    public double calcForceExertedBy(Body b){
        double G = 6.67 * Math.pow(10, -11);
        double F = G * mass * b.mass / Math.pow(calcDistance(b), 2);
        return F;
    }

    public double calcForceExertedByX(Body b){
        return calcForceExertedBy(b) * (b.xxPos - xxPos) /calcDistance(b);
    }

    public double calcForceExertedByY(Body b){
        return calcForceExertedBy(b) * (b.yyPos - yyPos) /calcDistance(b);
    }

    public double calcNetForceExertedByX(Body[] array){
        double Fx = 0;
        for (Body body : array) {
            if (this.equals(body)) {
                continue;
            }
            Fx = Fx + calcForceExertedByX(body);
        }
        return Fx;
    }

    public double calcNetForceExertedByY(Body[] array){
        double Fy = 0;
        for (Body body : array) {
            if (this.equals(body)) {
                continue;
            }
            Fy = Fy + calcForceExertedByY(body);
        }
        return Fy;
    }

    public void update(double dt, double fx, double fy){
        double ax = fx / mass;
        double ay = fy / mass;
        xxVel = xxVel + dt * ax;
        yyVel = yyVel + dt * ay;
        xxPos = xxPos + dt * xxVel;
        yyPos = yyPos + dt * yyVel;

    }

}
