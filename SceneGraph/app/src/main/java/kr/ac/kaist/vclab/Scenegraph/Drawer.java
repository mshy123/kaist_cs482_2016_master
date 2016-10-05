package kr.ac.kaist.vclab.Scenegraph;

import java.util.Vector;

/**
 * Created by PCPC on 2016-10-05.
 */
public class Drawer extends SgNodeVisitor{

    protected Vector<RigTForm> rbtStack;
    ShaderState curSS;

    public Drawer(RigTForm initialRbt, ShaderState curSS){
        this.curSS = curSS;
        rbtStack = new Vector<>();
        rbtStack.add(initialRbt);
    }

    @Override
    public boolean visit(SgTransformNode node){
        //Problem
        //Update the Rigid Transform in the hierachy

        return true;
    }

    @Override
    public boolean postVisit(SgTransformNode node){
        rbtStack.remove(rbtStack.size() - 1);
        return true;
    }

    @Override
    public boolean visit(SgShapeNode node){

        //Problem
        //Calculate a ModelViewMatrix and NormalizeMatrix
        //and send to the shader
        //ref: ShareState Class
        float[] MVM = new float [16];
        float[] nM = new float[16];


        node.draw(curSS);
        return true;
    }

    @Override
    public boolean postVisit(SgShapeNode node) {
        return true;
    }

    ShaderState getCurSS() {
        return curSS;
    }

}
