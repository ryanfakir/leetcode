package leetcode_208;

/**
 * Created by pyan on 11/7/2016.
 */
public class LeetCode {
    class TrieNode {
        // Initialize your data structure here.
        private TrieNode[] nodes;
        public boolean hasWord;
        public TrieNode() {
            nodes = new TrieNode[26];
            hasWord = false;
        }
        public boolean insert(String word, int level) {
            if (level == word.length()) {
                this.hasWord = true;
                return true;
            }
            int offset = word.charAt(level) - 'a';
            if (this.nodes[offset] == null) {
                this.nodes[offset] = new TrieNode();
            }
            return this.nodes[offset].insert(word, level+1);
        }

        public TrieNode search(String word, int level) {
            if (level == word.length()) {
                return this;
            }
            int offset = word.charAt(level) - 'a';
            if (this.nodes[offset] == null) {
                return null;
            }
            return this.nodes[offset].search(word, level+1);
        }

    }

    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            this.root.insert(word, 0);
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode node = this.root.search(word, 0);
            return node != null && node.hasWord;
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode node = this.root.search(prefix, 0);
            return node != null;
        }
    }

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
}
