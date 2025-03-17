package flipping_an_image;

public class FlipAndInvertAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int low = 0;
            int high = image[i].length -1;

            while(low <= high){
                if(image[i][low] == image[i][high]){
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }

                low++;
                high--;
            }
        }

        return image;
    }
}
//  a             b
// [1,0,0,0,1,1,0,0];
// change a and b only if they are different, math hack.

// [0,1,1,1,0,0,1,1];
// [1,0,0,0,1,1,0,0];