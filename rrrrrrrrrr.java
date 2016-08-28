static String reverseString(String str) {
char[] strArray = str.toCharArray();
int j = strArray.length - 1;
for (int i = 0; i < j; i++, j--) {
strArray[i] ^= strArray[j];
strArray[j] ^= strArray[i];
strArray[i] ^= strArray[j];
}

return new String(strArray);
}

static String reverseLine(String line) {
String reverseString = reverseString(line);
StringBuffer temp = new StringBuffer();
StringBuffer result = new StringBuffer();
for (int i =0; i 0) {
result.append(reverseString(temp.toString()));
temp.delete(0, temp.length());
}
result.append(reverseString.charAt(i));
} else {
temp.append(reverseString.charAt(i));
}
}

// appends the last string if any
if (temp.length() > 0) {
result.append(reverseString(temp.toString()));
}

return result.toString();
}
