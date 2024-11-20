
package Ayudantia 7;

public class recorridoBST {

    InOrder(root)
    if(root == null){
        return
    }
    InOrder(root.left)
    Print(root.key)
    InOrder(root.right)

    PreOrder(root)
    if(root == null){
        return
    }
    Print(root.key)
    PreOrder(root.left)
    PreOrder(root.right)

    PostOrder(root)
    if(root == null){
        return
    }
    PostOrder(root.left)
    PostOrder(root.right)
    Print(root.key)
    
}
