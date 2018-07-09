package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Tabung(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        
        float BODY_LENGTH = 5f;
        float BODY_RADIUS = 1f;
        int SLICES = 30;
        int STACKS = 1;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }

    static void Roda(GL gl) {
        float amb[] = {0.0f, 0.0f, 0.0f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.0f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        
        float BODY_LENGTH = 1f;
        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 10;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }

    static void BigBox(GL gl) {
        float amb[] = {0, 0.5f, 0, 1};
        float diff[] = {0, 0.5f, 0, 1};
        float spec[] = {0, 0.5f, 0, 1};
        float shine = 0;

        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-10000, 0, -10000);
        gl.glVertex3f(10000, 0, -10000);
        gl.glVertex3f(10000, 0, 10000);
        gl.glVertex3f(-10000, 0, 10000);
        gl.glEnd();
    }
    
    static void Krangka(GL gl) {
        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */ 
        float amb[] = {0.34f, 1.34f, 0.34f, 1};
        float diff[] = {0.41f, 1.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f2: Surface bagian bawah (ABFE) */
        float amb1[] = {1.0f, 1.34f, 0.34f, 1};
        float diff1[] = {0.41f, 1.41f, 0.41f, 1};
        float spec1[] = {0.11f, 0.11f, 0.11f, 1};
        float shine1 = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb1, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff1, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec1, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(4.0f, 2.0f, 0.0f);
        gl.glVertex3f(4.0f, -2.0f, 0.0f);
        gl.glVertex3f(-4.0f, -2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 4.0f);
        gl.glVertex3f(-4.0f, -2.0f, 4.0f);
        gl.glVertex3f(-4.0f, -2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-4.0f, 2.0f, 4.0f);
        gl.glVertex3f(4.0f, 2.0f, 4.0f);
        gl.glVertex3f(4.0f, -2.0f, 4.0f);
        gl.glVertex3f(-4.0f, -2.0f, 4.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(4.0f, 2.0f, 4.0f);
        gl.glVertex3f(4.0f, 2.0f, 0.0f);
        gl.glVertex3f(4.0f, -2.0f, 0.0f);
        gl.glVertex3f(4.0f, -2.0f, 4.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 4.0f);
        gl.glVertex3f(4.0f, 2.0f, 4.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(4.0f, -2.0f, 0.0f);
        gl.glVertex3f(-4.0f, -2.0f, 0.0f);
        gl.glVertex3f(-4.0f, -2.0f, 4.0f);
        gl.glVertex3f(4.0f, -2.0f, 4.0f);
        gl.glEnd();
    }
}