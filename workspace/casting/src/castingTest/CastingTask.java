package castingTest;



// ���ø���
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ������ ������
// �ִϸ��̼��̶�� "�ڸ�����"��� ���
// ��ȭ��� "4D" ��� ���
// ��󸶶�� "����" ��� ���





public class CastingTask {
	
	void sd(Video video) {
		
		if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.sds();
		}else if(video instanceof Animation){
			Animation animation = (Animation)video;
			animation.animation();
		}else if(video instanceof Film) {
			Film film = (Film)video;
			film.film();
		}
		
	}
		public static void main(String[] args) {
			CastingTask video = new CastingTask();
			Drama drama = new Drama(); 
			Animation animation = new Animation(); 
			
			video.sd(drama);
			
			
			
			
			
			
			
		}
	
	
}
