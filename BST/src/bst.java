class bst{
    
    Node root;

    private class Node{
        // Data Fields
        String keyword;
        Record record;
        int size;
        Node l;
        Node r;

        // Constructor
        private Node(String k){ keyword = k; }

        private void update(Record r) {
            r.next = record;
            record = r;
        }

        private void insert(String keyword, Record record) {
            // if the keyword is matches, updates the record
            if (keyword.compareTo(this.keyword) == 0)
                update(record);

            // if the keyword should go to the left subtree
            else if (keyword.compareTo(this.keyword) < 0) {
                if (l == null) { // if there is no more to traverse creates new Node
                    l = new Node(keyword);
                    l.update(record);
                }
                else
                    l.insert(keyword, record); // recursive call
            }
            // if the keyword should go to the right subtree
            else if (keyword.compareTo(this.keyword) > 0) {
                if (r == null) { // if there is no more to traverse creates New Node
                    r = new Node(keyword);
                    r.update(record);
                }
                else
                    r.insert(keyword, record); // recursive call
            }
        }

        private boolean contains(String keyword) {
            if (keyword.compareTo(this.keyword) == 0) // returns on first search hit
                return true;
            else if (keyword.compareTo(this.keyword) < 0 && l != null) // if keyword is on left and right isnt empty
                return l.contains(keyword);
            else if (keyword.compareTo(this.keyword) > 0 && r != null) // if keyword is on right and left inst empty
                return r.contains(keyword);
            else
                return false; // if keyword is not found
        }

        private Record get_records(String keyword) {
            if (keyword.compareTo(this.keyword) == 0) // returns on first search hit
                return record;

            // if keyword belongs in left subtree
            if (keyword.compareTo(this.keyword) < 0) {
                if (l == null) // if there is no left sub tree
                    return null;
                return l.get_records(keyword);
            }

            // if keyword belongs in right subtree
            else if (keyword.compareTo(this.keyword) > 0) { // if keyword belongs in right subtree
                if (r == null) // if there is no right sub tree
                    return null;
                return r.get_records(keyword);
            }
            return null; // failsafe
        }
    }

    public bst(){
        this.root = null;
    }
      
    public void insert(String keyword, FileData fd){
        Record recordToAdd = new Record(fd.id, fd.title, fd.author, null);
        if (root == null) {
            root = new Node(keyword);
            root.record = recordToAdd;
        }
        else
            root.insert(keyword, recordToAdd);
    }
    
    public boolean contains(String keyword){
        if (root == null)
            return false;
        else
            return root.contains(keyword); // recursive function in Node class
    }

    public Record get_records(String keyword){
        if (root == null) // if there is no content
            return null;
        return root.get_records(keyword);
    }

    public void delete(String keyword) { root = delete(root, keyword); }

    Node delete(Node root, String keyword) {
        if (root == null) // if there is no more content
            return root;

        // if keyword belongs in left subtree
        if (keyword.compareTo(root.keyword) < 0)
            root.l = delete(root.l, keyword);

        // if keyword belongs in right subtree
        else if (keyword.compareTo(root.keyword) > 0)
            root.r = delete(root.r, keyword);

        else {
            // if the node has 1 or less children
            if (root.l == null)
                return root.r;
            else if (root.r == null)
                return root.l;

            // replaces the keyword and record with that of the inorder successor
            Node temp = root.r;
            while (temp.l != null)
                temp = temp.l;
            root.keyword = temp.keyword;
            root.record = temp.record;

            // deletes inorder successor recursively
            root.r = delete(root.r, root.keyword);
        }

        return root;
    }

    public void print() { print(root); }

    private void print(Node t){
        if (t!=null){
            print(t.l);
            System.out.println(t.keyword);
            Record r = t.record;
            while(r != null){
                System.out.printf("\t%s\n",r.title);
                r = r.next;
            }
            print(t.r);
        } 
    }
    

}
