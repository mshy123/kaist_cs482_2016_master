package kr.ac.kaist.vclab.robotObj;

import kr.ac.kaist.vclab.Scenegraph.RigTForm;
import kr.ac.kaist.vclab.Scenegraph.SgGeometryShapeNode;
import kr.ac.kaist.vclab.Scenegraph.SgRbtNode;
import kr.ac.kaist.vclab.Scenegraph.SgTransformNode;
import kr.ac.kaist.vclab.helloopengl3d.Cube;
import kr.ac.kaist.vclab.helloopengl3d.Sphere;

/**
 * Created by PCPC on 2016-10-02.
 */
public class MyRobot extends SgRbtNode{
    public final static int BODY = 0;
    public final static int UPPER_ARM_RIGHT = 1;
    public final static int UPPER_ARM_LEFT = 2;
    public final static int LOWER_ARM_RIGHT = 3;
    public final static int LOWER_ARM_LEFT = 4;
    public final static int UPPER_LEG_RIGHT = 5;
    public final static int UPPER_LEG_LEFT = 6;
    public final static int LOWER_LEG_RIGHT = 7;
    public final static int LOWER_LEG_LEFT = 8;
    public final static int HEAD = 9;
    int NUM_JOINTS = 10, NUM_SHAPES = 10;
    SgRbtNode[] bodyParts;

    private float z = -6;
    private float y= 0;
    ShapeDesc shapeDesc[];
    JointDesc jointDesc[];
    SgTransformNode jointNodes[];
    private float[] color = new float[3];

    public SgTransformNode constructRobot(float[] rColor){
        SgRbtNode base = new SgRbtNode();

        float ARM_LEN = 0.7f,ARM_THICK = 0.25f,LEG_LEN = 1f,
            LEG_THICK = 0.25f, TORSO_LEN = 0.9f, TORSO_THICK = 0.25f,
            TORSO_WIDTH = 0.7f,HEAD_SIZE = 0.3f;

        //Problem
        //Fill out the blanks below

        jointDesc = new JointDesc[NUM_JOINTS];
        jointDesc[BODY] = new JointDesc(-1); // torso
        jointDesc[UPPER_ARM_RIGHT] = new JointDesc(   ); // upper right arm
        jointDesc[UPPER_ARM_LEFT] = new JointDesc(  ); // upper left arm
        jointDesc[LOWER_ARM_RIGHT] = new JointDesc(   ); // lower right arm
        jointDesc[LOWER_ARM_LEFT] = new JointDesc(  ); // lower left arm
        jointDesc[UPPER_LEG_RIGHT] = new JointDesc(  ); // upper right leg
        jointDesc[UPPER_LEG_LEFT] = new JointDesc(  ); // upper left leg
        jointDesc[LOWER_LEG_RIGHT] = new JointDesc(   ); // lower right leg
        jointDesc[LOWER_LEG_LEFT] = new JointDesc(   ); // lower left
        jointDesc[HEAD] = new JointDesc(   ); // head

        shapeDesc = new ShapeDesc[NUM_SHAPES];
        shapeDesc[BODY] = new ShapeDesc(BODY, 0, 0, z, TORSO_WIDTH, TORSO_LEN, TORSO_THICK, new Cube()); // torso
        shapeDesc[UPPER_ARM_RIGHT] = new ShapeDesc(UPPER_ARM_RIGHT, ARM_LEN/2, 0, z, ARM_LEN/2, ARM_THICK/2, ARM_THICK/2, new Cube()); // upper right arm
        shapeDesc[UPPER_ARM_LEFT] = new ShapeDesc(UPPER_ARM_LEFT, -ARM_LEN/2, 0, z, ARM_LEN/2, ARM_THICK/2, ARM_THICK/2, new Cube()); // upper left arm
        shapeDesc[LOWER_ARM_RIGHT] = new ShapeDesc(LOWER_ARM_RIGHT, ARM_LEN/2, 0, z, ARM_LEN, ARM_THICK, ARM_THICK, new Cube()); // lower right arm
        shapeDesc[LOWER_ARM_LEFT] = new ShapeDesc(LOWER_ARM_LEFT, -ARM_LEN/2, 0, z, ARM_LEN, ARM_THICK, ARM_THICK, new Cube()); // lower left arm
        shapeDesc[UPPER_LEG_RIGHT] = new ShapeDesc(UPPER_LEG_RIGHT, 0, -LEG_LEN/2, z, LEG_THICK/2, LEG_LEN/2, LEG_THICK/2, new Cube()); // upper right leg
        shapeDesc[UPPER_LEG_LEFT] = new ShapeDesc(UPPER_LEG_LEFT, 0, -LEG_LEN/2, z, LEG_THICK/2, LEG_LEN/2, LEG_THICK/2, new Cube()); // upper left leg
        shapeDesc[LOWER_LEG_RIGHT] = new ShapeDesc(LOWER_LEG_RIGHT, 0, -LEG_LEN/2, z, LEG_THICK, LEG_LEN, LEG_THICK, new Cube()); // lower right leg
        shapeDesc[LOWER_LEG_LEFT] = new ShapeDesc(LOWER_LEG_LEFT, 0, -LEG_LEN/2, z, LEG_THICK, LEG_LEN, LEG_THICK, new Cube()); // lower left leg
        shapeDesc[HEAD] = new ShapeDesc(HEAD, 0, HEAD_SIZE, z, HEAD_SIZE/2, HEAD_SIZE/2, HEAD_SIZE/2, new Sphere()); // head

        jointNodes = new SgTransformNode[NUM_JOINTS];
        for(int i = 0; i < NUM_JOINTS; ++i){
            //Problem
            if(        ){
                jointNodes[i] = base;
            }
            else {
                //Problem
                // create a node and link
            }
        }
        for (int i = 0; i < NUM_SHAPES; ++i) {

            //Problem
            //Create a shape nodes and link to joint node with the information of JointDesc and Shape Disc


        }
        return base;
    }

}