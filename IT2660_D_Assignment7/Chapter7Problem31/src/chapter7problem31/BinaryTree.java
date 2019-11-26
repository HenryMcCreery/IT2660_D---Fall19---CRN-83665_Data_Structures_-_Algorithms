/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7problem31;

/**
 *
 * @author hjmcc
 */
public class BinaryTree {
    
    TreeNode root;
    public BinaryTree()
    {
        root = null;
    }
    public boolean insert(Listing newListing)
    {
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode n = new TreeNode();
        if(n == null) // out of memory
            return false;
        else // insert the node
        {
            n.node = newListing.deepCopy(); // fill in the TreeNode's fields
            n.lc = null;
            n.rc = null;
            if(root == null) // tree is empty
            {
                root = n;
            }
            else
            {
                findNode(newListing.getKey(), p, c); // find the node's parents
            if(newListing.getKey().compareTo(p.get().node.getKey()) <0)
                p.get().lc = n; //insert new node as a left child
            else
                p.get().rc = n; // insert new node as a right child
            }
            return true;
            }
        } // end insert method
    
    public Listing fetch(String targetKey)
    { boolean found;
    TreeNodeWrapper p = new TreeNodeWrapper();
    TreeNodeWrapper c = new TreeNodeWrapper();
    found = findNode(targetKey, p, c); //locate the node
    if(found == true)
        return c.get().node.deepCopy();
    else
        return null;
    }  //end of fetch method
    
    public boolean delete (String targetKey)
    {
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode largest;
        TreeNode nextLargest;
        found = findNode(targetKey, p, c);
        if(found == false) // node not found
            return false;
        else // identify the case number
        {if(c.get().lc == null && c.get().rc == null) // case 1: deleted
                                                      // node has no children
        {if(p.get().lc == c.get())   //deleted  node is a left child
            p.get().lc = null;
        else                        //deleted node is a right child
            p.get().rc = null;
        } //end case 1
        else if(c.get().lc == null || c.get().rc == null) //case 2:
                                                          //1 child
        { if(p.get().lc == c.get())  //deleted node is a left child
            { if(c.get().lc != null)        //deleted node has a left child
                p.get().lc = c.get();               //removed the ".lc;" 
              else
                p.get().lc = c.get().rc;
            }
        else                        //deleted node is a right child
        { if(c.get().lc != null)    //deleted node has a left child
            p.get().rc = c.get().lc;
            else 
            p.get().rc = c.get().rc;
        }
        
    }   //end case 2
        else //case 3: deleted node has two children
        {
            nextLargest = c.get().lc;
            largest = nextLargest.rc;
            if(largest != null) //left child has a right subtree
            {while(largest.rc != null)  //move down right subtree
            { nextLargest = largest;
            largest = largest.rc;
            }
            c.get().node = largest.node;   //overwrite deleted node
            nextLargest.rc = largest.lc;    //save the left subtree
                }
            else  //left child does not have a right subtree
            { nextLargest.rc = c.get().rc;      //save the right subtree
            if(p.get().lc == c.get())      //deleted node is a left child
            p.get().lc = nextLargest;       //jump around deleted node
            else                            //deleted node is a right child
                p.get().rc = nextLargest;   // jump around deleted node 
            }
        }   //end of case 3
        return true;
        }
    }   //end of delete method
    
    public boolean update(String targetKey, Listing newListing)
    { if (delete(targetKey) == false)
        return false;
    else if(insert(newListing) == false)
        return false;
    return true;
    }       //end of update
    
    public class TreeNode
    {
        private Listing node;
        private TreeNode lc;
        private TreeNode rc;
        public TreeNode()
        {
            
        }
    }  //end of class TreeNode
    private boolean findNode(String targetKey, TreeNodeWrapper parent, TreeNodeWrapper child)
            
    {
        parent.set(root);
        child.set(root);
        if(root == null)  //tree is empty
            return true;
        while(child.get() != null)
        {
            if(child.get().node.compareTo(targetKey) == 0) //node found
                return true;
            else
            {parent.set(child.get());
            if(targetKey.compareTo(child.get().node.getKey()) < 0)
                child.set(child.get().lc);
            else
                child.set(child.get().rc);
            }
        }   //end while
        return false;
    }  // end of findNode
    
    public void showAll()
    {
        if(root == null)
            System.err.println("the structure is empty");
        else
            LeftNodeRightTraversal(root);
    }
    
      
            public void LeftNodeRightTraversal(TreeNode root) 
    {
        if(root.lc != null)
        {
            LeftNodeRightTraversal(root.lc);
        }

        System.out.println(root.node);
        if(root.rc != null)
        {
           LeftNodeRightTraversal(root.rc);
        }
    }
            
                public void RightNodeLeftTraversal(TreeNode root) 
    {
        if(root.rc != null)
        {
            LeftNodeRightTraversal(root.rc);
        }

        System.out.println(root.node);
        if(root.lc != null)
        {
           LeftNodeRightTraversal(root.lc);
        }
    }
    
    
    public class TreeNodeWrapper
    { TreeNode treeRef = null;
    public TreeNodeWrapper()
    {
    }
    public TreeNode get()
    { return treeRef;
    }
    public void set(TreeNode t)
    { treeRef = t;
    }
    } //end of class TreeNodeWrapper
} //end class BinaryTree
        
        
        
        

